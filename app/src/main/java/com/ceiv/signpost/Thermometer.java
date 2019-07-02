package com.ceiv.signpost;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.internal.MemoryPersistence;

import java.util.Random;

public class Thermometer {
    public static final String BROKER_URL = "tcp://192.168.203.59:1883";
    public static final String TOPIC = "de/eclipsemagazin/blackice/warnings";
    private MqttClient client;
    public Thermometer() {
        try {
            client = new MqttClient(BROKER_URL, MqttClient.generateClientId(), new MemoryPersistence());
        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void start() {
        try {
            client.connect();
            publishTemperature();
            client.disconnect();
        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void publishTemperature() throws MqttException {
        final MqttTopic temperatureTopic = client.getTopic(TOPIC);
        final int temperature = createRandomNumberBetween(-20, 4);
        final MqttMessage message = new MqttMessage(String.valueOf(temperature).getBytes());
        System.out.println("Published data. Topic: " + temperatureTopic.getName() + "  Message: " + temperature);
    }
    public static int createRandomNumberBetween(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

}

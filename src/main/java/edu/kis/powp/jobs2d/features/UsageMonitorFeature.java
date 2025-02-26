package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.monitor.DeviceMonitorDriver;
import edu.kis.powp.jobs2d.drivers.observer.ApplyDriverDecoratorsSubscriber;

public class UsageMonitorFeature {

    private static final DeviceMonitorDriver deviceMonitorDriver = new DeviceMonitorDriver();

    public static void setupDeviceMonitorPlugin(DriverManager driverManager) {
        ApplyDriverDecoratorsSubscriber.getInstance().addDriverDecorator(deviceMonitorDriver);
        ApplyDriverDecoratorsSubscriber.getInstance().setDriverManager(driverManager);
        driverManager.addSubscriber(ApplyDriverDecoratorsSubscriber.getInstance());
    }
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.08 at 02:43:13 PM CET 
//


package com.alliander.jaxb2.management;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENTLOG_CLEARED"/>
 *     &lt;enumeration value="POWER_FAILURE"/>
 *     &lt;enumeration value="POWER_RETURNED"/>
 *     &lt;enumeration value="CLOCK_UPDATE"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_OLD_TIME"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_NEW_TIME"/>
 *     &lt;enumeration value="CLOCK_INVALID"/>
 *     &lt;enumeration value="REPLACE_BATTERY"/>
 *     &lt;enumeration value="BATTERY_VOLTAGE_LOW"/>
 *     &lt;enumeration value="TARIFF_ACTIVATED"/>
 *     &lt;enumeration value="ERROR_REGISTER_CLEARED"/>
 *     &lt;enumeration value="ALARM_REGISTER_CLEARED"/>
 *     &lt;enumeration value="HARDWARE_ERROR_PROGRAM_MEMORY"/>
 *     &lt;enumeration value="HARDWARE_ERROR_RAM"/>
 *     &lt;enumeration value="HARDWARE_ERROR_NV_MEMORY"/>
 *     &lt;enumeration value="WATCHDOG_ERROR"/>
 *     &lt;enumeration value="HARDWARE_ERROR_MEASUREMENT_SYSTEM"/>
 *     &lt;enumeration value="FIRMWARE_READY_FOR_ACTIVATION"/>
 *     &lt;enumeration value="FIRMWARE_ACTIVATED"/>
 *     &lt;enumeration value="PASSIVE_TARIFF_UPDATED"/>
 *     &lt;enumeration value="SUCCESSFUL_SELFCHECK_AFTER_FIRMWARE_UPDATE"/>
 *     &lt;enumeration value="TERMINAL_COVER_REMOVED"/>
 *     &lt;enumeration value="TERMINAL_COVER_CLOSED"/>
 *     &lt;enumeration value="STRONG_DC_FIELD_DETECTED"/>
 *     &lt;enumeration value="NO_STRONG_DC_FIELD_ANYMORE"/>
 *     &lt;enumeration value="METER_COVER_REMOVED"/>
 *     &lt;enumeration value="METER_COVER_CLOSED"/>
 *     &lt;enumeration value="FAILED_LOGIN_ATTEMPT"/>
 *     &lt;enumeration value="CONFIGURATION_CHANGE"/>
 *     &lt;enumeration value="METROLOGICAL_MAINTENANCE"/>
 *     &lt;enumeration value="TECHNICAL_MAINTENANCE"/>
 *     &lt;enumeration value="RETRIEVE_METER_READINGS_E"/>
 *     &lt;enumeration value="RETRIEVE_METER_READINGS_G"/>
 *     &lt;enumeration value="RETRIEVE_INTERVAL_DATA_E"/>
 *     &lt;enumeration value="RETRIEVE_INTERVAL_DATA_G"/>
 *     &lt;enumeration value="COMMUNICATION_ERROR_M_BUS_CHANNEL_1"/>
 *     &lt;enumeration value="COMMUNICATION_OK_M_BUS_CHANNEL_1"/>
 *     &lt;enumeration value="REPLACE_BATTERY_M_BUS_CHANNEL_1"/>
 *     &lt;enumeration value="FRAUD_ATTEMPT_M_BUS_CHANNEL_1"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_M_BUS_CHANNEL_1"/>
 *     &lt;enumeration value="NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_1"/>
 *     &lt;enumeration value="PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_1"/>
 *     &lt;enumeration value="COMMUNICATION_ERROR_M_BUS_CHANNEL_2"/>
 *     &lt;enumeration value="COMMUNICATION_OK_M_BUS_CHANNEL_2"/>
 *     &lt;enumeration value="REPLACE_BATTERY_M_BUS_CHANNEL_2"/>
 *     &lt;enumeration value="FRAUD_ATTEMPT_M_BUS_CHANNEL_2"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_M_BUS_CHANNEL_2"/>
 *     &lt;enumeration value="NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_2"/>
 *     &lt;enumeration value="PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_2"/>
 *     &lt;enumeration value="COMMUNICATION_ERROR_M_BUS_CHANNEL_3"/>
 *     &lt;enumeration value="COMMUNICATION_OK_M_BUS_CHANNEL_3"/>
 *     &lt;enumeration value="REPLACE_BATTERY_M_BUS_CHANNEL_3"/>
 *     &lt;enumeration value="FRAUD_ATTEMPT_M_BUS_CHANNEL_3"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_M_BUS_CHANNEL_3"/>
 *     &lt;enumeration value="NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_3"/>
 *     &lt;enumeration value="PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_3"/>
 *     &lt;enumeration value="COMMUNICATION_ERROR_M_BUS_CHANNEL_4"/>
 *     &lt;enumeration value="COMMUNICATION_OK_M_BUS_CHANNEL_4"/>
 *     &lt;enumeration value="REPLACE_BATTERY_M_BUS_CHANNEL_4"/>
 *     &lt;enumeration value="FRAUD_ATTEMPT_M_BUS_CHANNEL_4"/>
 *     &lt;enumeration value="CLOCK_ADJUSTED_M_BUS_CHANNEL_4"/>
 *     &lt;enumeration value="NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_4"/>
 *     &lt;enumeration value="PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    EVENTLOG_CLEARED,
    POWER_FAILURE,
    POWER_RETURNED,
    CLOCK_UPDATE,
    CLOCK_ADJUSTED_OLD_TIME,
    CLOCK_ADJUSTED_NEW_TIME,
    CLOCK_INVALID,
    REPLACE_BATTERY,
    BATTERY_VOLTAGE_LOW,
    TARIFF_ACTIVATED,
    ERROR_REGISTER_CLEARED,
    ALARM_REGISTER_CLEARED,
    HARDWARE_ERROR_PROGRAM_MEMORY,
    HARDWARE_ERROR_RAM,
    HARDWARE_ERROR_NV_MEMORY,
    WATCHDOG_ERROR,
    HARDWARE_ERROR_MEASUREMENT_SYSTEM,
    FIRMWARE_READY_FOR_ACTIVATION,
    FIRMWARE_ACTIVATED,
    PASSIVE_TARIFF_UPDATED,
    SUCCESSFUL_SELFCHECK_AFTER_FIRMWARE_UPDATE,
    TERMINAL_COVER_REMOVED,
    TERMINAL_COVER_CLOSED,
    STRONG_DC_FIELD_DETECTED,
    NO_STRONG_DC_FIELD_ANYMORE,
    METER_COVER_REMOVED,
    METER_COVER_CLOSED,
    FAILED_LOGIN_ATTEMPT,
    CONFIGURATION_CHANGE,
    METROLOGICAL_MAINTENANCE,
    TECHNICAL_MAINTENANCE,
    RETRIEVE_METER_READINGS_E,
    RETRIEVE_METER_READINGS_G,
    RETRIEVE_INTERVAL_DATA_E,
    RETRIEVE_INTERVAL_DATA_G,
    COMMUNICATION_ERROR_M_BUS_CHANNEL_1,
    COMMUNICATION_OK_M_BUS_CHANNEL_1,
    REPLACE_BATTERY_M_BUS_CHANNEL_1,
    FRAUD_ATTEMPT_M_BUS_CHANNEL_1,
    CLOCK_ADJUSTED_M_BUS_CHANNEL_1,
    NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_1,
    PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_1,
    COMMUNICATION_ERROR_M_BUS_CHANNEL_2,
    COMMUNICATION_OK_M_BUS_CHANNEL_2,
    REPLACE_BATTERY_M_BUS_CHANNEL_2,
    FRAUD_ATTEMPT_M_BUS_CHANNEL_2,
    CLOCK_ADJUSTED_M_BUS_CHANNEL_2,
    NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_2,
    PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_2,
    COMMUNICATION_ERROR_M_BUS_CHANNEL_3,
    COMMUNICATION_OK_M_BUS_CHANNEL_3,
    REPLACE_BATTERY_M_BUS_CHANNEL_3,
    FRAUD_ATTEMPT_M_BUS_CHANNEL_3,
    CLOCK_ADJUSTED_M_BUS_CHANNEL_3,
    NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_3,
    PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_3,
    COMMUNICATION_ERROR_M_BUS_CHANNEL_4,
    COMMUNICATION_OK_M_BUS_CHANNEL_4,
    REPLACE_BATTERY_M_BUS_CHANNEL_4,
    FRAUD_ATTEMPT_M_BUS_CHANNEL_4,
    CLOCK_ADJUSTED_M_BUS_CHANNEL_4,
    NEW_M_BUS_DEVICE_DISCOVERED_CHANNEL_4,
    PERMANENT_ERROR_FROM_M_BUS_DEVICE_CHANNEL_4;

    public String value() {
        return name();
    }

    public static EventType fromValue(String v) {
        return valueOf(v);
    }

}

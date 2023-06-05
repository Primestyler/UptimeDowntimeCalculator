package com.example.uptime_downtime_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DowntimeControllerTest {
    private DowntimeController calc=new DowntimeController();
@Test
void calculateDowntime_50Percent_ReturnsOneDayTwelveHoursThirtyMinutesZeroSeconds() {
    DowntimeController controller = new DowntimeController();
    DownTimeResponse response = controller.calculateDowntime(50);

    assertEquals(0, response.getDays());
    assertEquals(12, response.getHours());
    assertEquals(0, response.getMinutes());
    assertEquals(0, response.getSeconds());
}
}
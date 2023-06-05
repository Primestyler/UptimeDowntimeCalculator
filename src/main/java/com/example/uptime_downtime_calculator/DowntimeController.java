package com.example.uptime_downtime_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DowntimeController {

    @RequestMapping("/api/downtime")
    public DownTimeResponse calculateDowntime(@RequestParam double percentage) {
        double totalUptime = 24 * 60 * 60;
        double totalDownTime = (1 - percentage/100) * totalUptime;

        int days = (int) (totalDownTime / (24 * 60 * 60));
        totalDownTime %= (24 * 60 * 60);
        int hours = (int) (totalDownTime / (60 * 60));
        totalDownTime %= (60 * 60);
        int minutes = (int) (totalDownTime / 60);
        totalDownTime %= 60;
        int seconds = (int) totalDownTime;

        return new DownTimeResponse(days, hours, minutes, seconds);
    }
}


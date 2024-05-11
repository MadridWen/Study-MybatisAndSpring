package cn.edu.hrbu.mall.entity;

import org.springframework.stereotype.Component;

// USB存储设备的接口
public interface UsbStorage {
    void read(); // 读取数据
    void write(); // 写入数据
}

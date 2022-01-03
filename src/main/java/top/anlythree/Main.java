package top.anlythree;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.error("打印正常log");
        LOGGER.error("${java:os}");
        System.out.println("start success！！");
    }
}

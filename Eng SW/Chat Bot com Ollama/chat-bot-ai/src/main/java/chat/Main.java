package chat;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;


public class Main {
    public static void main(String[] args) {
            String botToken = "7525327925:AAEHn2BS23ajrOGSiILDIyYkq2Nb8fBGKEA";
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            botsApplication.registerBot(botToken, new MyAmazingBot(botToken));
            System.out.println("MyAmazingBot started!");
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

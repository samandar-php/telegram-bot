package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
       Message message = update.getMessage();
       if (message.hasText()){
        System.out.println(message.getText());
    }
}
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }

    @Override
    public String getBotUsername() {
        return "@PreUzb_bot";
    }



    @Override
    public String getBotToken(){
        return "8335153930:AAHSO2rt5cp_YNaHwvlsAhjMdaAL26mLUyc";
    }
}

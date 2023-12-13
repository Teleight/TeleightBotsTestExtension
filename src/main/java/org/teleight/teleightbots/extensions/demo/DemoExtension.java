package org.teleight.teleightbots.extensions.demo;

import org.teleight.teleightbots.bot.Bot;
import org.teleight.teleightbots.event.EventListener;
import org.teleight.teleightbots.event.bot.UpdateReceivedEvent;
import org.teleight.teleightbots.extensions.Extension;
import org.teleight.teleightbots.extensions.annotation.ExtensionInfo;

import java.util.concurrent.TimeUnit;

@ExtensionInfo(
        name = "demo",
        version = "1.0.0",
        parentBot = "--INSERT-BOT-USERNAME--HERE"
)
public class DemoExtension extends Extension {

    public DemoExtension(Bot bot) {
        super(bot);
    }

    @Override
    public void start() {
        System.out.println("DemoExtension loaded by: " + bot.getBotUsername());

        bot.getEventManager().addListener(EventListener.of(UpdateReceivedEvent.class,
                event -> System.out.println("UpdateReceivedEvent received by DemoExtension")));
    }

    @Override
    public void shutdown() {
        System.out.println("DemoExtension shutdown");
    }

    @Override
    public String getName() {
        return "demo";
    }

}

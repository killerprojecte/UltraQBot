package dev.rgbmc.ultraqbot.actions;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.entity.MiraiMessageTransmittable;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.*;
import dev.rgbmc.ultraqbot.events.MessageEvent;
import dev.rgbmc.ultraqbot.utils.FileUtils;
import dev.rgbmc.ultraqbot.utils.ImageUtils;

import java.io.File;
import java.net.URL;
import java.util.List;

public abstract class TargetableAction {
    public void sendMessage(String msg) {
        sendMessage(new PlainText(msg));
    }

    public abstract void sendMessage(BaseComponent baseComponent);

    public void sendImage(Image image) {
        sendMessage(image);
    }

    public void sendImage(File file) {
        sendImage(ImageUtils.fromFile(file));
    }

    public void sendImage(URL url) {
        sendImage(ImageUtils.fromURL(url));
    }

    public void sendImage(String base64) {
        sendImage(ImageUtils.fromBase64(base64));
    }

    public void at(MemberFriend member) {
        sendMessage(new At(member.getId(), "@" + member.getId()));
    }

    public void atAll() {
        sendMessage(new AtAll());
    }

    public void sendDice(int point) {
        sendMessage(new Dice(point));
    }

    public void emoji(int emojiId, String emojiDisplay) {
        sendMessage(new Emoji(emojiId, emojiDisplay));
    }

    public void sendFlashImage(FlashImage flashImage) {
        sendMessage(flashImage);
    }

    public void sendFlashImage(File file) {
        sendFlashImage(ImageUtils.flashImageFromFile(file));
    }

    public void sendFlashImage(URL url) {
        sendFlashImage(ImageUtils.flashImageFromURL(url));
    }

    public void sendFlashImage(String base64) {
        sendFlashImage(ImageUtils.flashImageFromBase64(base64));
    }

    public void sendForwardMessage(ForwardMessage forwardMessage) {
        sendMessage(forwardMessage);
    }

    public void sendForwardMessage(List<ForwardNode> forwardNodes) {
        sendForwardMessage(new ForwardMessage(forwardNodes));
    }

    public void sendJsonMessage(String json) {
        sendMessage(new Json(json));
    }

    public void sendJsonMessage(JsonElement jsonElement) {
        sendJsonMessage(new Gson().toJson(jsonElement));
    }

    public void sendMiraiCode(MiraiCode miraiCode) {
        sendMessage(miraiCode);
    }

    public void sendMiraiCode(String code) {
        sendMiraiCode(new MiraiCode(code));
    }

    public void shareMusic(Music music) {
        sendMessage(music);
    }

    public void shareMusic(MusicType platform, String musicTitle, String musicSummary, String musicInfoUrl, String musicCoverUrl, String musicUrl, String briefInfo) {
        shareMusic(new Music(platform, musicTitle, musicSummary, musicInfoUrl, musicCoverUrl, musicUrl, briefInfo));
    }

    public void sendPoke(Poke poke) {
        sendMessage(poke);
    }

    public void sendPoke(PokeType pokeType) {
        sendPoke(new Poke(pokeType));
    }

    public void sendVoice(Voice voice) {
        sendMessage(voice);
    }

    public void sendVoice(URL amrVoice) {
        try {
            File file = File.createTempFile("UltraQBot_Voice_", "amr");
            FileUtils.INSTANCE.download(amrVoice, file);
            long length = VoiceUtil.INSTANCE.getAmrDuration(file);
            sendVoice(FileUtils.INSTANCE.fileToBase64(file), length);
            file.deleteOnExit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void sendVoice(String base64, long length) {
        sendVoice(new Voice("", "", base64, length));
    }

    public void sendVoiceFromId(String voiceId, long length) {
        sendVoice(new Voice(voiceId, "", "", length));
    }

    public void sendQuote(MiraiMessageTransmittable target, BaseComponent message, MessageSource source) {
        target.quoteMessage(message, String.valueOf(source.getMessageId()));
    }

    public void sendQuote(MessageEvent<? extends com.xbaimiao.mirai.event.MessageEvent> event) {
        sendQuote(event.getSender(), event.getRawMessage(), event.getMessageSource());
    }
}

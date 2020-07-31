package org.brunocvcunha.instagram4j.storymetadata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoryCountdownItem extends StoryItem {
    private CountdownSticker countdown_sticker;
    
    @Getter
    @Setter
    public static class CountdownSticker {
	private String countdown_id;
	private long end_ts;
	private String text;
	private String text_color;
	private String start_background_color;
	private String end_background_color;
	private String digit_color;
	private String digit_card_color;
	private boolean following_enabled;
	private boolean is_owner;
    }
}

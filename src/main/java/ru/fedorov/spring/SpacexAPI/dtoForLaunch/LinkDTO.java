package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkDTO {

    private String mission_patch;
    private String mission_patch_small;
    private String reddit_campaign;
    private String reddit_launch;
    private String reddit_recovery;
    private String reddit_media;
    private String presskit;
    private String article_link;
    private String wikipedia;
    private String video_link;
    private String youtube_id;
    private String[] flickr_images;
}

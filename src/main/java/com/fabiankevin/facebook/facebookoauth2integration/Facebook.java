package com.fabiankevin.facebook.facebookoauth2integration;

import com.fabiankevin.facebook.facebookoauth2integration.model.Feed;
import com.fabiankevin.facebook.facebookoauth2integration.model.Post;
import com.fabiankevin.facebook.facebookoauth2integration.model.Profile;

import java.util.List;

public class Facebook extends ApiBinding {

  private static final String GRAPH_API_BASE_URL =
              "https://graph.facebook.com/v2.12";

  public Facebook(String accessToken) {
    super(accessToken);
  }

  public Profile getProfile() {
    return restTemplate.getForObject(
            GRAPH_API_BASE_URL + "/me", Profile.class);
  }

  public List<Post> getFeed() {
    return restTemplate.getForObject(
            GRAPH_API_BASE_URL + "/me/feed", Feed.class).getData();
  }

}
package com.example.demooauthclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@SpringBootApplication
public class DemoOauthClientApplication {
	@Autowired
	private OAuth2AuthorizedClientService authorizedClientService;
	public static void main(String[] args) {
		SpringApplication.run(DemoOauthClientApplication.class, args);
	}

	@GetMapping("/")
	public String home(Model model, Authentication authentication) {
		if (authentication != null && authentication.isAuthenticated()) {
			OAuth2AccessToken oAuth2AccessToken = authorizedClientService.loadAuthorizedClient("cognito", "google_111413148059616784064").getAccessToken();

			model.addAttribute("access_token", oAuth2AccessToken.getTokenValue());
		}

		return "home";
	}
}

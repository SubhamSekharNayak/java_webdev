// package com.example.lms;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
//                 .authorizeHttpRequests(auth -> auth
//                         .requestMatchers(
//                                 "/", "/index", // Allow root and /index if needed for direct access
//                                 "/login", "/register", "/about", "/contact", "/gallery", "/service", "/faq",
//                                 "/css/**", "/js/**", "/images/**", "/static/**", "/assets/**",
//                                 // IMPORTANT: Add your internal JSP path here
//                                 "/WEB-INF/views/**" // Allow access to all resources within /WEB-INF/views/
//                         ).permitAll() // Allow these pages and static files for all users without authentication
//                         .requestMatchers("/admin/**").hasRole("ADMIN") // Admin-only URLs
//                         .requestMatchers("/student/**").hasRole("STUDENT") // Student-only URLs
//                         .anyRequest().authenticated() // Require authentication for all other requests
//                 ).formLogin(form -> form
//                         .loginPage("/login")
//                         .loginProcessingUrl("/login")
//                         .defaultSuccessUrl("/dashboard", true)
//                         .failureUrl("/login?error=true")
//                         .permitAll());

//         return http.build();
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();

//     }

//     @Bean  
//     public UserDetailsService userDetailsService() {
//         UserDetails admin = User.withUsername("admin")
//                 .password(passwordEncoder().encode("admin123"))
//                 .roles("ADMIN")
//                 .build();
//         UserDetails student = User.withUsername("student")
//                 .password(passwordEncoder().encode("student123"))
//                 .roles("STUDENT")
//                 .build();
//         UserDetails faculty = User.withUsername("faculty")
//                 .password(passwordEncoder().encode("faculty123"))
//                 .roles("FACULTY")
//                 .build();
//         return new InMemoryUserDetailsManager(admin, student, faculty);

//     }
// }



package com.example.lms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
            )
            .formLogin(form -> form.disable());
        return http.build();
    }
}
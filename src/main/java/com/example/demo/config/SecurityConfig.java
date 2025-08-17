package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // desactiva CSRF para facilitar pruebas con fetch/Postman
            .authorizeHttpRequests(auth -> auth
                // permitir acceso público a vistas, recursos estáticos y endpoints de auth
                .requestMatchers(
                    "/", "/login", "/register", "/dashboard",
                    "/css/**", "/js/**", "/images/**",
                    "/api/auth/**"
                ).permitAll()
                // cualquier otra ruta requiere autenticación
                .anyRequest().authenticated()
            )
            // desactiva el login y basic auth provistos por Spring Security
            .formLogin(form -> form.disable())
            .httpBasic(basic -> basic.disable());

        return http.build();
    }

    // Bean para inyectar PasswordEncoder (usar en tus servicios)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

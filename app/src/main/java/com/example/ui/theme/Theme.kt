package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val CustomLightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = Color.White,
    secondary = CyanSecondary,
    onSecondary = Color.White,
    tertiary = AccentRose,
    background = Slate950,
    onBackground = WhiteText,
    surface = Slate900,
    onSurface = WhiteText,
    surfaceVariant = Slate800,
    onSurfaceVariant = GrayMuted
)

@Composable
fun MyApplicationTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = CustomLightColorScheme,
        typography = Typography,
        content = content
    )
}

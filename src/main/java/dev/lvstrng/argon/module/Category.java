package dev.lvstrng.argon.module;

import dev.lvstrng.argon.utils.EncryptedString;

public enum Category {
	COMBAT(EncryptedString.of("Hitty ")),
	MISC(EncryptedString.of("Random Shit")),
	RENDER(EncryptedString.of("Screeny")),
	CLIENT(EncryptedString.of("GOONY"));
	public final CharSequence name;

	Category(CharSequence name) {
		this.name = name;
	}
}

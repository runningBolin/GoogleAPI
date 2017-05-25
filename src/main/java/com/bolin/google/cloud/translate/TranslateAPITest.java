package com.bolin.google.cloud.translate;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

/**
 * @author bolin
 * @create 2017年5月25日
 */
public class TranslateAPITest {

	public static void main(String... args) {
		Translate translate = TranslateOptions.getDefaultInstance().getService();
		String sourceLanguage = "en";
		String targetLanguage = "zh-CN";
		TranslateOption srcLang = TranslateOption.sourceLanguage(sourceLanguage);
		TranslateOption tgtLang = TranslateOption.targetLanguage(targetLanguage);

		// Use translate `model` parameter with `base` and `nmt` options.
		TranslateOption model = TranslateOption.model("nmt");

		String sourceText = "Hello World";

		Translation translation = translate.translate(sourceText, srcLang, tgtLang, model);
		System.out.printf("Source Text:\n\tLang: %s, Text: %s\n", sourceLanguage, sourceText);
		System.out.printf("TranslatedText:\n\tLang: %s, Text: %s\n", targetLanguage, translation.getTranslatedText());

	}

}

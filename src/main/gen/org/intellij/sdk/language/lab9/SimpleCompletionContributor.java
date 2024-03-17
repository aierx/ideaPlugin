package org.intellij.sdk.language.lab9;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.intellij.sdk.language.psi.SimpleTypes;
import org.jetbrains.annotations.NotNull;

final class SimpleCompletionContributor extends CompletionContributor {

  SimpleCompletionContributor() {
    extend(CompletionType.BASIC, PlatformPatterns.psiElement(SimpleTypes.VALUE),
        new CompletionProvider<>() {
          public void addCompletions(@NotNull CompletionParameters parameters,
                                     @NotNull ProcessingContext context,
                                     @NotNull CompletionResultSet resultSet) {
              System.out.println("a");
            resultSet.addElement(LookupElementBuilder.create("Hello"));
          }
        }
    );
  }

}
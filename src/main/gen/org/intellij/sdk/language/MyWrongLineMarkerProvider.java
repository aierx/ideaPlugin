package org.intellij.sdk.language;

import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProvider;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import org.jetbrains.annotations.NotNull;

final class MyWrongLineMarkerProvider implements LineMarkerProvider {
  public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement element) {
    if (element instanceof PsiMethod) {
      return new LineMarkerInfo(element, TextRange.EMPTY_RANGE);
    }
    return null;
  }
}
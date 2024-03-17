package org.intellij.sdk.language.lab13;

import com.example.demo.SimpleIcons;
import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import org.intellij.sdk.language.psi.SimpleProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

final class SimplePropertyIconProvider extends IconProvider {

  @Override
  public @Nullable Icon getIcon(@NotNull PsiElement element, int flags) {
    return element instanceof SimpleProperty ? SimpleIcons.FILE : null;
  }

}
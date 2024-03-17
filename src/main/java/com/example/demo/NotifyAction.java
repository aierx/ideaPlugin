package com.example.demo;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.jsp.JspxFileViewProvider;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author leiwenyong
 * @since 2024-03-11
 */
public class NotifyAction extends AnAction {
	@Override
	public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
		System.out.println("aaaaaaaa");
		anActionEvent.getData(CommonDataKeys.PSI_FILE).accept(new PsiRecursiveElementWalkingVisitor() {
			@Override
			public void visitElement(@NotNull PsiElement element) {
				super.visitElement(element);
				System.out.println(element.getText());
			}
		});
		PsiFile data = anActionEvent.getData(CommonDataKeys.PSI_FILE);
//		anActionEvent.getData(CommonDataKeys.PSI_FILE)
		
	}
}

package org.intellij.sdk.language.lab10;

import com.example.demo.SimpleFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import org.intellij.sdk.language.SimpleFile;
import org.intellij.sdk.language.psi.SimpleProperty;

public class SimpleElementFactory {
  
  public static SimpleProperty createProperty(Project project, String name) {
    final SimpleFile file = createFile(project, name);
    return (SimpleProperty) file.getFirstChild();
  }
  
  public static SimpleFile createFile(Project project, String text) {
    String name = "dummy.simple";
    return (SimpleFile) PsiFileFactory.getInstance(project).createFileFromText(name, SimpleFileType.INSTANCE, text);
  }
  
  public static SimpleProperty createProperty(Project project, String name, String value) {
    final SimpleFile file = createFile(project, name + " = " + value);
    return (SimpleProperty) file.getFirstChild();
  }
  
  public static PsiElement createCRLF(Project project) {
    final SimpleFile file = createFile(project, "\n");
    return file.getFirstChild();
  }
}
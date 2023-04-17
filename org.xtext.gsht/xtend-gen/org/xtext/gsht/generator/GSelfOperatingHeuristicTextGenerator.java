/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.gsht.gSelfOperatingHeuristicText.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GSelfOperatingHeuristicTextGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<Model> _function = (Model it) -> {
      this.generateFile(it, fsa);
    };
    IteratorExtensions.<Model>forEach(Iterators.<Model>filter(resource.getAllContents(), Model.class), _function);
  }

  public void generateFile(final Model model, final IFileSystemAccess2 fsa) {
    String _plus = (model + ".java");
    fsa.generateFile(_plus, this.generate(model));
  }

  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t\t");
    _builder.newLine();
    return _builder;
  }
}
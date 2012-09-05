package org.porting.less4j.core.ast;

import java.util.ArrayList;
import java.util.List;

import org.porting.less4j.core.parser.HiddenTokenAwareTree;

public abstract class ASTCssNode {
  
  private HiddenTokenAwareTree underlyingStructure;
  private List<Comment> openingComments = new ArrayList<Comment>();
  private List<Comment> orphanComments = new ArrayList<Comment>();
  private List<Comment> trailingComments = new ArrayList<Comment>();

  public ASTCssNode(HiddenTokenAwareTree underlyingStructure) {
    this.underlyingStructure = underlyingStructure;
  }
  
  public abstract List<? extends ASTCssNode> getChilds();
  
  //TODO: this class will be an implementation of IASTCssNode or similar interface this method does not belong to that interface 
  public HiddenTokenAwareTree getUnderlyingStructure() {
    return underlyingStructure;
  }

  public void setUnderlyingStructure(HiddenTokenAwareTree underlyingStructure) {
    this.underlyingStructure = underlyingStructure;
  }

  public List<Comment> getTrailingComments() {
    return trailingComments;
  }

  public void setTrailingComments(List<Comment> trailingComments) {
    this.trailingComments = trailingComments;
  }
  
  public void addTrailingComments(List<Comment> comments) {
    this.trailingComments.addAll(comments);
  }
  
  public List<Comment> getOpeningComments() {
    return openingComments;
  }

  public void setOpeningComments(List<Comment> openingComments) {
    this.openingComments = openingComments;
  }

  public List<Comment> getOrphanComments() {
    return orphanComments;
  }

  public void setOrphanComments(List<Comment> orphanComments) {
    this.orphanComments = orphanComments;
  }

  public abstract ASTCssNodeType getType();
}
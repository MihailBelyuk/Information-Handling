package by.belyuk.third_project.text_enum;

public enum TextElementType {
  PARAGRAPH("\t", "\n"),
  SENTENCE("", " "),
  WORD("", ""),
  SYMBOL("", "");
  private String prefix;
  private String postfix;

  TextElementType(String prefix, String postfix) {
    this.prefix = prefix;
    this.postfix = postfix;
  }

  public String getPrefix() {
    return prefix;
  }

  public String getPostfix() {
    return postfix;
  }
}

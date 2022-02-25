package by.belyuk.third_project.entity;

import by.belyuk.third_project.text_enum.TextElementType;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements Component {
  private List<Component> textComponents;
  private TextElementType textElementType;

  public TextComposite(TextElementType textElementType) {
    this.textElementType = textElementType;
    textComponents = new ArrayList<>();
  }

  @Override
  public List<Component> getComponents() {
    return textComponents;
  }

  @Override
  public void add(String component) {}

  @Override
  public void remove(Component component) {}

  public List<Component> getTextComponents() {
    return textComponents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TextComposite that = (TextComposite) o;

    if (textComponents != null
        ? !textComponents.equals(that.textComponents)
        : that.textComponents != null) return false;
    return textElementType == that.textElementType;
  }

  @Override
  public int hashCode() {
    int result = textComponents != null ? textComponents.hashCode() : 0;
    result = 31 * result + (textElementType != null ? textElementType.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("TextComposite{");
    sb.append("textComponents=").append(textComponents);
    sb.append(", textElementType=").append(textElementType);
    sb.append('}');
    return sb.toString();
  }
}

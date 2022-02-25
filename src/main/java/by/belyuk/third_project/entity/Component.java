package by.belyuk.third_project.entity;

import java.util.List;

public interface Component {
  List<Component> getComponents();

  void add(String component);

  void remove(Component component);
}

package by.belyuk.third_project.reader;

import by.belyuk.third_project.exception.SomeException;

public interface TextReader {
  String read(String filePath) throws SomeException;
}

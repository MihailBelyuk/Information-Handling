package by.belyuk.third_project;

import by.belyuk.third_project.exception.SomeException;
import by.belyuk.third_project.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws SomeException {
    //        System.out.println(ReaderImpl.getInstance().read("data/text example.txt"));
    //        TextReaderImpl.getInstance().read("data/text example.txt");
    //        ParserToSymbolsImpl parserToSymbols = new ParserToSymbolsImpl();
    //    System.out.println(parserToSymbols.parse("data/text example.txt"));
    List<String> text = new ArrayList<>();
    text =
        List.of(TextReaderImpl.getInstance().read("data/text example.txt").strip().split("\\s+"));
    System.out.println(text);
    //        System.out.println(parser.parse(ReaderImpl.getInstance().read("data/text
    // example.txt")).length);
    //     System.out.println(parser.parse(TextReaderImpl.getInstance().read("data/text
    // example.txt")));
  }
}

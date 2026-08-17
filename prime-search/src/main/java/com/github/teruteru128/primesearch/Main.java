package com.github.teruteru128.primesearch;

import com.github.teruteru128.primesearch.db.CreateCandidateDB;
import com.github.teruteru128.primesearch.db.InsertPrimeNumberVerifyTask;
import com.github.teruteru128.primesearch.search.PrimeSearch;
import java.util.concurrent.Callable;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "prime-search", subcommands = {PrimeSearch.class, CreateCandidateDB.class,
    InsertPrimeNumberVerifyTask.class, CommandLine.HelpCommand.class})
public class Main implements Callable<Integer> {

  public static void main(String[] args) {
    int exitCode = new CommandLine(new Main()).execute(args);
    Runtime.getRuntime().exit(exitCode);
  }

  @Override
  public Integer call() {
    System.err.println("うんち！");
    return ExitCode.USAGE;
  }

}

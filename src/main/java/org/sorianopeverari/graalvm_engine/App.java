package org.sorianopeverari.graalvm_engine;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.MagicNames;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Project antProject = new Project();

    	File buildFile = new File(args[0] + "ant.xml");

    	ProjectHelper.configureProject(antProject, buildFile);
        DefaultLogger consoleLogger = new DefaultLogger();
        
        consoleLogger.setErrorPrintStream(System.err);
        consoleLogger.setOutputPrintStream(System.out);
        consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
        
        antProject.addBuildListener(consoleLogger);

        antProject.setBasedir(args[0]);
        antProject.init();
    	antProject.executeTarget("dowork");
        System.out.println("Press enter to continue");
        //System.in.read();
    }
}

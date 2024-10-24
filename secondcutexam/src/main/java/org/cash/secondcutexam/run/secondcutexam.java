package org.cash.secondcutexam.run;

import org.openxava.util.*;


public class secondcutexam {

	public static void main(String[] args) throws Exception {
		DBServer.start("secondcutexam-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("secondcutexam"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}

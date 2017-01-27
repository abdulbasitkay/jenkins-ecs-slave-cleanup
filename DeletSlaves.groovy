def a = 0
for (aSlave in hudson.model.Hudson.instance.slaves) {
  println(a + '====================');
  System.out.println('Name: ' + aSlave.name);
  System.out.println('getLabelString: ' + aSlave.getLabelString());
  if (aSlave.name == '<SLAVE NAME>') {
    System.out.println(a +=1 + ' Shutting down node!!!!');
    aSlave.getComputer().setTemporarilyOffline(true,null);
    aSlave.getComputer().doDoDelete();
  }
}

# ThreadLocal
https://www.baeldung.com/java-threadlocal


Parar ejecucion un tiempo aleatorio:
```
    private void sleep(int max, int min) {
        try {
            int milisegundos = new Random().nextInt(max - min + 1) + min;
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```
start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role hub

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS,version=8 -port 5557

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=chrome,platform=WINDOWS -port 5558

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser "browserName=internet explorer,version=7,platform=WINDOWS,version=9" -port 5555 

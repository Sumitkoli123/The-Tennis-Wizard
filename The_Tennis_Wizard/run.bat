cd C:\Users\Admin\eclipse-workspace\The_Tennis_Wizard
set projectLocation=C:\Users\Admin\eclipse-workspace\The_Tennis_Wizard
set file=C:\Users\Admin\eclipse-workspace\The_Tennis_Wizard\Extent_Report\Console_Log\Console_log.txt
Echo %projectLocation%
mvn test >%file%
pause
### Windows Shell

###### Get OS Architecture
```
> wmic os get osarchitecture

OSArchitecture
64-bit
```
###### Show history

F7

### Find a given file on PATH
for %i in (java.exe) do @echo.   %~$PATH:i

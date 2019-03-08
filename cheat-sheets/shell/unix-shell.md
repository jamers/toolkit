### find

### grep
```bash
grep xyz                                    # lines containing xyz
grep -v xyz                                 # lines not containing xyz
grep -v -f /opt/dev/bin/ignore_pattern_file #
grep -r --include *.properties "value-to-search-for" .

```

### Pipes
```bash
SomeCommand > SomeFile.txt # write output to file
SomeCommand >> SomeFile.txt # append output to file

SomeCommand &> SomeFile.txt # write output and stderr to file
SomeCommand &>> SomeFile.txt # append output and stderr to file

SomeCommand >&1 | tee SomeFile.txt # write output to file AND console
SomeCommand 2>&1 | tee SomeFile.txt # write output and stderr to file AND console

mvn clean install 2>&1 | tee mvn-clean-install-log.txt

```

### Archives
```bash
tar -zcvf archive-name.tar.gz directory-name
tar -zcvf jdk7_40.tar.gz jdk7
```

### Misc
```bash
id

cat /proc/cpuinfo
lscpu
```

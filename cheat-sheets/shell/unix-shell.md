clear
echo / printf
cut
sort
uname

### find

### grep
```bash
grep xyz                                    # lines containing xyz
grep -v xyz                                 # lines not containing xyz
grep -v -f /opt/dev/bin/ignore_pattern_file #
grep -r --include *.properties "value-to-search-for" .

```

### awk
```bash
ps -ef | grep "Host Controller" | awk '{ print $2 " " $8 " " $9 " " $NF}'  
```
* Structure: BEGIN block, BODY block, END block
* Begin & end execute once, body on each line
* Begin & end optional
* Syntax
```bash
BEGIN {commands}
/pattern/ {commands}
END {commands}
```

### Disk Usage
```bash
df -h /tmp/
df -h .

du -hsc * # Find sizes h=human readable, s=summarize, c=total
du . | sort -n | tail -200 | tee size.txt
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
TODO https://www.cyberciti.biz/faq/how-do-i-compress-a-whole-linux-or-unix-directory/
TODO https://www.tecmint.com/18-tar-command-examples-in-linux/
```bash
tar -zcvf archive-name.tar.gz directory-name
tar -zcvf jdk7_40.tar.gz jdk7
```

### rm
```
ls | egrep -v tomcat | xargs rm -r
```

### SCP
TODO https://kb.iu.edu/d/agye

### Misc
```bash
id

cat /proc/cpuinfo
lscpu
```

# Book: Pro Git 2

## Useful links
* [Pro Git 2 Full Book Free Online](https://git-scm.com/book/en/v2)

##### Remove files from working tree and staging
```bash
# delete the file on disc
# the file will still show up in git status, but unstaged
rm file.txt

# add the deletion to staging
git rm file.txt

# remove file from tracking, but not working directory (e.g. accidentally added .iml file)
git rm --cached \*.iml

# git mv can be used as a shortcut for renaming
git mv README.md README
# is equivalent to
mv README.md README
git rm README.md
git add README

```
##### Log
```bash
git log # basic
git log --patch # or -p, shows diff per commit
git log -2 # limit to last 2 commits
git log --stat # show stats per commit
git log --pretty=oneline # or pretty=[short|full|fuller]
git log --pretty=format:"%h - %an, %ar : %s" # specify your own pretty format
git log --graph # show ascii graph
git log --pretty=format:"%h %s" --graph
git log --pretty="%h - %s" --author='Junio C Hamano' --since="2008-10-01" --before="2008-11-01" --no-merges -- t/
```
##### Log arguments
| Option | Result |
|-----|-----|
| -p | Show the patch introduced with each commit. |
| --stat | Show statistics for files modified in each commit. |
| --shortstat | Display only the changed/insertions/deletions line from the --stat command. |
| --name-only | Show the list of files modified after the commit information. |
| --name-status | Show the list of files affected with added/modified/deleted information as well. |
| --abbrev-commit | Show only the first few characters of the SHA-1 checksum instead of all 40. |
| --relative-date | Display the date in a relative format (for example, “2 weeks ago”) instead of using the full date format. |
| --graph | Display an ASCII graph of the branch and merge history beside the log output. |
| --pretty | Show commits in an alternate format. Options include oneline, short, full, fuller, and format (where you specify your own format). |
| --oneline | Shorthand for --pretty=oneline --abbrev-commit used together. |
##### Pretty arguments
| Option | Result |
|-----|-----|
| %H | Commit hash |
| %h | Abbreviated commit hash |
| %T | Tree hash |
| %t | Abbreviated tree hash |
| %P | Parent hashes |
| %p | Abbreviated parent hashes |
| %an | Author name |
| ae | Author email |
| ad | Author date (format respects the --date=option) |
| %ar | Author date, relative |
| %cn | Committer name |
| %ce | Committer email |
| %cd | Committer date |
| %cr | Committer date, relative |
| %s | Subject |

## 1. Getting Started


### 1.1 About version control

### 1.2 A Short History of Git

### 1.3 Git Basics

### 1.4 The Command Line

### 1.5 Installing Git

### 1.6 First Time Git Setup

### 1.7 Getting Help

### 1.8 Summary

## 2. Git Basics

### 2.1 Getting a Git Repository

### 2.2 Recording Changes to the Repository

### 2.3 Viewing the Commit History

### 2.4 Undoing things
```bash
git commit -m 'initial commit'
git add forgotten_file
git commit --amend  # 'initial commit' will be completely replaced by amended
```

### 2.5
### 2.6
### 2.7
### 2.8
## 3. Git Branching
### 3.1
### 3.2
### 3.3
### 3.4
### 3.5
### 3.6
### 3.7
## 4. Git on the Server
### 4.1
### 4.2
### 4.3
### 4.4
### 4.5
### 4.6
### 4.7
### 4.8
### 4.9
### 4.10
## 5. Distributed Git
###
## 6. GitHub
###
## 7. Git Tools
###
## 8. Customizing Git
###
## 9. Git and Other Systems
###
## 10. Git Internals
###
## A1. Git in Other Environments
###
## A2. Embedding Git in your Applications
###
## A3. Git Commands
###

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

# Unstage a staged file
git reset HEAD file.txt

# Unmodify a modified file
git checkout -- file.txt
```

### 2.5 [Working with Remotes](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes)
```bash
# List all remote handles
git remote

# List shortname and remotes
git remote -v

# Add a new remote repo with given shortname
$ git remote add jamers https://github.com/jamers/cribsheets
$ git remote -v
jamers https://github.com/jamers/cribsheets (fetch)
jamers https://github.com/jamers/cribsheets (push)
origin https://github.com/other/cribsheets (fetch)
origin https://github.com/other/cribsheets (push)
# From now on you can use the alias instead of the full URL

git fetch jamers
```

### 2.6 Tagging
### 2.7 Git Aliases
### 2.8 Summary
## 3. Git Branching
### 3.1 Branches in a Nutshell
### 3.2 Basic Branching and Merging
### 3.3 Branch Management
### 3.4 Branching Workflows
### 3.5 Remote Branches
### 3.6 Rebasing
### 3.7 Summary
## 4. Git on the Server
### 4.1 The Protocols
### 4.2 Getting Git on a Server
### 4.3 Generating Your SSH Public Key
### 4.4 Setting up the Server
### 4.5 Git Daemon
### 4.6 Smart HTTP
### 4.7 GitWeb
### 4.8 GitLab
### 4.9 Third Party Hosted Options
### 4.10 Summary
## 5. Distributed Git
### 5.1 Distributed Workflows
### 5.2 Contributing to a Project
### 5.3 Maintaining a Project
### 5.4 Summary
## 6. GitHub
### 6.1 Account Setup and Configuration
### 6.2 Contributing to a Project
### 6.3 Maintaining a Project
### 6.4 Managing an Organization
### 6.5 Scripting GitHub
### 6.6 Summary
## 7. Git Tools
### 7.1 Revision Selection
### 7.2 Interactive Staging
### 7.3 Stashing and Cleaning
### 7.4 Signing Your Work
### 7.5 Searching
### 7.6 Rewriting History
### 7.7 Reset Demystified
### 7.8 Advanced Merging
### 7.9 Rerere
### 7.10 Debugging with Git
### 7.11 Submodules
### 7.12 Bundling
### 7.13 Replace
### 7.14 Credential Storage
### 7.15 Summary
## 8. Customizing Git
### 8.1 Git Configuration
### 8.2 Git Attributes
### 8.3 Git Hooks
### 8.4 An Example Git-Enforced Policy
### 8.5 Summary
## 9. Git and Other Systems
### 9.1 Git as a Client
### 9.2 Migrating to Git
### 9.3 Summary
## 10. Git Internals
### 10.1 Plumbing and Porcelain
### 10.2 Git Objects
### 10.3 Git References
### 10.4 Packfiles
### 10.5 The Refspec
### 10.6 Transfer Protocols
### 10.7 Maintenance and Data Reovery
### 10.8 Environment Variables
### 10.9 Summary
## A1. Git in Other Environments
### A1.1 Graphical Interfaces
### A1.2 Git in Visual Studio
### A1.3 Git in Eclipse
### A1.4 Git in Bash
### A1.5 Git in Zsh
### A1.6 Git in Powershell
### A1.7 Summary
## A2. Embedding Git in your Applications
### A2.1 Command-line Git
### A2.2 Libgit2
### A2.3 JGit
### A2.4 go-git
### A2.5 Dulwich
## A3. Git Commands
### A3.1 Setup and Config
### A3.2 Getting and Creating Projects
### A3.3 Basic Snapshotting
### A3.4 Branching and Merging
### A3.5 Sharing and Updating Projects
### A3.6 Inspection and Comparison
### A3.7 Debugging
### A3.8 Patching
### A3.9 Email
### A3.10 External Systems
### A3.11 Administration
### A3.12 Plumbing Commands

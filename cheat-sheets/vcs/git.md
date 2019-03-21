# Git

##### List all branches including remotes (seems to include deleted?)
```bash
git branch -lr # -l list, -r remote
```

###### Rebase a feature branch back onto the epic
```bash
Starting state
| master
|\_ release/EPIC-1
|  \_ feature/STORY-1
```
Timeline
- master exists
- EPIC-1 cut
- STORY-1 cut from EPIC-1
- master advances 500 commits
- STORY-1 has changes pushed
- EPIC-1 rebased to master

Now want to rebase STORY-1, and push changes into EPIC-1
```bash
# Commands
git checkout release/EPIC-1
git pull
git checkout feature/STORY-1
git pull
git rebase release/EPIC-1
# optional - manually fix rebase in e.g. Intellij
git rebase --continue # if merge conflicts
git push
# If branches have diverged it means that your local version of STORY-1 changes are different to the repo, because it has been rebased
git push -f
```

###### Create a new repo and add it to github
```bash
echo "# test" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/jamers/test.git
git push -u origin master
```
###### Push a local repo into github
```bash
git remote add origin https://github.com/jamers/test.git
git push -u origin master
```

#### Move changes from master to branch (that is clean)
```bash
git status
> On branch master, ahead of origin/master by 2 commits

git checkout my-new-branch-that-is-clean-rebased-from-master
git merge master
> Updating blah

git status
> on branch my.... , ahead of origin/my... by two commits

git checkout master

git reset --head HEAD~2 # Push master back by two commits - losing the work
```
#### Find common ancestor of two branches
```
git merge-base branch2 branch3
050dc022f3a65bdc78d97e2b1ac9b595a924c3f2
```

#### Git cherry pick
````bash
git cherry-pick abcd2763..bed9892e
git cherry-pick abcd2763^..bed9892e # ^ means include first revision
````

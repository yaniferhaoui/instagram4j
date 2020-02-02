git config credential.helper store
git fetch
git merge
git add .
if [ -n "$1" ]; then
    git commit -m "$*"
    git push
fi
git pull

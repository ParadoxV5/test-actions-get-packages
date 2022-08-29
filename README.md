I learned in [`java-mystring`](https://github.com/ParadoxV5/java-mystring)
and [`mygem`](https://github.com/ParadoxV5/mygem) (Ruby)
how to submit to GitHub Packages using GitHub Actions.
Following GitHub’s guides, I was able to fetch those packages
as dependencies for a hypothetical local development.

But, since GitHub Actions is for Continuous Integration and Deployment,
what about retrieving from GitHub Packages inside GitHub Actions?

I tinkered in a private (now deleted) repository
and have figured out the scripts for both
[![Java](https://github.com/ParadoxV5/test-actions-get-packages/actions/workflows/java.yml/badge.svg)](https://github.com/ParadoxV5/test-actions-get-packages/actions/workflows/java.yml)
([Maven](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry))
and
[![Ruby](https://github.com/ParadoxV5/test-actions-get-packages/actions/workflows/ruby.yml/badge.svg)](https://github.com/ParadoxV5/test-actions-get-packages/actions/workflows/ruby.yml)
([RubyGems](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-rubygems-registry)).
The trickiest part was analyzing the configuration for authenticating to
GitHub Packages for each Programming Language’s setup and environment.
You can find my conclusions in the [`.github/workflows`](.github/workflows)
folder and their results in this Repo’s Actions tab.
Those workflow `.xml`s work well as example/template files too!


### License

This work is free. You can redistribute it and/or modify it under the terms of the
[Do What The F*ck You Want To Public License, Version 2](http://www.wtfpl.net/),
as published by Sam Hocevar. See the LICENSE file for more details.
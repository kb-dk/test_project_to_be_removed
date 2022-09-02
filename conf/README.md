# Configuration folder

The `conf/`-folder contains files intended for local `jetty:run`, Tomcat deployment as well as
OpenShift deployment.

# kb-test-behaviour.yaml

This config contains behaviour data: Thread allocation, allowed fields for lookup, limits for arguments etc.

The behaviour config is normally controlled by developers and is part of the code repository.
Sensitive information such as machine names and user/passwords should not be part of this config.

It will be automatically merged with the environment config when accessed through the
application config system.

# kb-test-environment.yaml

This config contains environment-data: Servers, usernames, passwords etc.
It will be automatically merged with the core config when accesses through the application config system.

In the code repository, this file is called `kb-test-environment.yaml.sample` and should not contain real
values, only the configuration structure. Due to the ".sample" extension, it will not be loaded by
`ServiceConfig`.

When applied to production, the file should be copied, adjusted and renamed to `kb-test-environment.yaml`
The new file `kb-test-environment.yaml` should NOT be added to the code repository!

# kb-test-local.yaml

This config contains developer specific overrides, such as read-only account credentials and test server locations.
It is a mix of behaviour and environmental setup.
#
If will be automatically merged with the `kb-test-behaviour.yaml` upon application start.
Values in the `kb-test-local.yaml` files takes precedence over the behaviour file as the files are sorted
alphanumerically by name and applied in order.

This config is controlled by the individual developer and is not part of the code repository.

# kb-test-logback.xml

Logback configuration that outputs to file, as expected when running under Tomcat.

# ocp/ folder

Configurations intended for OpenShift.

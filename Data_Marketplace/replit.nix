{ pkgs }: {
  deps = [
    pkgs.openjdk17
    pkgs.nodejs
    pkgs.yarn
    pkgs.git
    pkgs.maven
    pkgs.gcc
  ];
}

package main

import (
	iosxe "github.com/lbrlabs/pulumi-iosxe/provider"
	"github.com/lbrlabs/pulumi-iosxe/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
)

func main() {
	// Modify the path to point to the new provider
	tfgen.Main("iosxe", version.Version, iosxe.Provider())
}

//go:generate go run ./generate.go

package main

import (
	_ "embed"

	iosxe "github.com/lbrlabs/pulumi-iosxe/provider"
	"github.com/lbrlabs/pulumi-iosxe/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

//go:embed schema-embed.json
var pulumiSchema []byte

func main() {
	// Modify the path to point to the new provider
	tfbridge.Main("iosxe", version.Version, iosxe.Provider(), pulumiSchema)
}

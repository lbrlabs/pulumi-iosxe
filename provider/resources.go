package iosxe

import (
	// must have a comment
	_ "embed"
	"fmt"
	"path/filepath"

	iosxe "github.com/CiscoDevNet/terraform-provider-iosxe/shim"
	"github.com/lbrlabs/pulumi-iosxe/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
)

// all of the token components used below.
const (
	mainPkg = "iosxe"
	// modules:
	mainMod = "index" // the iosxe module
)

//go:embed cmd/pulumi-resource-iosxe/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	info := tfbridge.ProviderInfo{
		P:                 pf.ShimProvider(iosxe.NewProvider()),
		Name:              "iosxe",
		DisplayName:       "Cisco IOS XE",
		Publisher:         "lbrlabs",
		LogoURL:           "",
		PluginDownloadURL: "github://api.github.com/lbrlabs",
		Version:           version.Version,
		MetadataInfo:      tfbridge.NewProviderMetadata(metadata),
		Description:       "A Pulumi package for creating and managing Cisco IOS XE Devices.",
		Keywords:          []string{"pulumi", "iosxe", "category/utility"},
		License:           "Apache-2.0",
		Homepage:          "https://www.pulumi.com",
		Repository:        "https://github.com/lbrlabs/pulumi-iosxe",
		GitHubOrg:         "CiscoDevNet",
		Config:            map[string]*tfbridge.SchemaInfo{},
		Resources:         map[string]*tfbridge.ResourceInfo{},
		DataSources:       map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@lbrlabs/pulumi-iosxe",
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "lbrlabs_pulumi_iosxe",
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/lbrlabs/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Lbrlabs.PulumiPackage",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	info.MustComputeTokens(tks.SingleModule("iosxe_", mainMod, tks.MakeStandard(mainPkg)))

	info.SetAutonaming(255, "-")

	//info.MustApplyAutoAliases()

	return info
}

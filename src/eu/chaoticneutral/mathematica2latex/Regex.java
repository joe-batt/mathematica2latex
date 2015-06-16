package eu.chaoticneutral.mathematica2latex;

public class Regex {

	public static void main(String[] args) {
		String s="\\[Alpha]";
		System.out.println(s.matches(".*\\\\\\[[A-Za-z]+\\].*"));
	}
}

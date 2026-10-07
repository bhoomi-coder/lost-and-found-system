public class Claim {
        int claimId;
        String proof;
        int claimedBy;
        String itemName;
        String location;
        String status;
        public Claim(int claimId,
                     String proof,
                     int claimedBy,
                     String itemName,
                     String location,
                     String status){
            this.claimId=claimId;
            this.proof=proof;
            this.claimedBy=claimedBy;
            this.itemName=itemName;
            this.location=location;
            this.status=status;

        }
        public Claim(
                String proof,
                int claimedBy,
                String itemName,
                String location,
                String status){
            this.proof=proof;
            this.claimedBy=claimedBy;
            this.itemName=itemName;
            this.location=location;
            this.status=status;

        }

        public int getClaimId() {
            return claimId;
        }

        public String getProof() {
            return proof;
        }

        public int getClaimedBy() {
            return claimedBy;
        }

        public String getItemName() {
            return itemName;
        }

        public String getLocation() {
            return location;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

